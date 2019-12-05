package com.training.controllers;

import com.training.entity.Medicine;

import com.training.entity.MedicineDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Map;

@Controller
public class MedicineController {

    @Autowired
    private MedicineDao dao;

    @Autowired
    private ModelAndView mdlView;

    @Autowired
    private Medicine medicine;

    @ModelAttribute("medicineTypes")
    public String[] loadMedicineType(){

        return new String[]{"Injection", "Tablet", "Bottle", "Capsule"};
    }


    @RequestMapping(method = RequestMethod.GET, value = "/addMedicine")
    public ModelAndView init(){

        mdlView.addObject("command",medicine);
        mdlView.setViewName("addMedicine");
        return mdlView;

    }

    @RequestMapping(method = RequestMethod.POST, value = "/addMedicine")
    public String onSubmit(@ModelAttribute("addedObject") Medicine medicine,Model model){
        String displayPage="addMedicine";
        try {
            int rowAdded = dao.add(medicine);
            displayPage="success";
        }
        catch (Exception e){
            medicine.setCode(0);
            medicine.setMedicineName("");
            medicine.setType("");
            medicine.setRatePerUnit(0);
            model.addAttribute("errorMessage","Product already exist");
            model.addAttribute("command",medicine);
            e.getMessage();
        }
        return displayPage;
    }

    @RequestMapping(method = RequestMethod.GET, value="/findAll")
    public ModelAndView findAll(){
        List<Map<String,Object>> list = dao.findAll();
        mdlView.addObject("itemList",list);
        mdlView.addObject("callFrom","multiEntity");
        mdlView.setViewName("showAllMedicines");
        return mdlView;
    }

    @RequestMapping(value = "/srch", method = RequestMethod.GET)
    public String searchPage(){

        return "searchById";
    }

    @RequestMapping(value = "/srch", method = RequestMethod.POST)
    public String find(@RequestParam("code") long key, Model model) {

        String nextPage = "searchById";
        try {
            Medicine found = dao.findById(key);

            model.addAttribute("foundOneItem", found);
            model.addAttribute("callFrom", "singleEntity");
            nextPage = "showAllMedicines";
        } catch (EmptyResultDataAccessException e) {
            model.addAttribute("errorMessage", "No entity");
        }
        return nextPage;
    }

    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public String onHomeCick(){

        return "menu";
    }
}
