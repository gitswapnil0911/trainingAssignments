import java.util.Random;

public class TestMedicine {
        public static void main(String[] args) {
                Medicine m[]=new Medicine[5];
                Random rnd= new Random();
                for(int i=0;i<m.length;i++){

                        switch (rnd.nextInt(3)){
                                case 0:{
                                        m[i]=new Tablet();
                                        m[i].displayLabel();
                                        break;
                                }
                                case 1:{
                                        m[i]=new Syrup();
                                        m[i].displayLabel();
                                        break;
                                }
                                case 2:{
                                        m[i]=new Ointment();
                                        m[i].displayLabel();
                                        break;
                                }
                                default : break;
                        }
                }

        }
}


