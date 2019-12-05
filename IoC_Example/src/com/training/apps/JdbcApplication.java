package com.training.apps;

import com.training.beans.Medicine;
import com.training.config.DbConfig;
import com.training.ifaces.MyRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.*;
import java.util.logging.Logger;

public class JdbcApplication {

    public static void main(String[] args) {

        Logger log = Logger.getAnonymousLogger();

        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(DbConfig.class);

        Medicine crocin = ctx.getBean(Medicine.class);

        crocin.setCode(102);
        crocin.setMedicineName("T.Candy");
        crocin.setRatePerUnit(53.00);
        MyRepository<Medicine> dao = ctx.getBean(MyRepository.class);

        /*int rowAdded = dao.add(crocin);

        log.info(Integer.toString(rowAdded) + " Added");
*/


        List<Map<String,Object>> rows = dao.findAll();

        for (Map<String,Object> eachRow : rows) {

            System.out.println(eachRow.get("code"));
            System.out.println(eachRow.get("medicineName"));
            System.out.println(eachRow.get("ratePerUnit"));

        }

        Medicine foundMedicine = dao.findById(101);
        System.out.println(foundMedicine);

        //int rowDeleted = dao.remove(103);
        // System.out.println(rowDeleted + " Deleted");

        int rowUpdated = dao.update(crocin);
        System.out.println(rowUpdated + "Row Updated");

    }
}
