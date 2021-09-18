package umg;

import com.sun.jdi.PathSearchingVirtualMachine;

public class Prueba {


    public static void main(String[] args) {


        alumno alu1 = new alumno(10, "7690", "Sergio Loyo");
        alumno alu2 = new alumno(10, "7691", "marlon Loyo");


        producto pro1 = new producto(001, "Cloro", 7.5);
        producto pro2 = new producto(002, "asistin", 8.5);

        alu1.igualque(alu2);
        alu1.mayorIgualQue(alu2);
        alu1.menorIgualQue(alu2);
        alu1.mayorQue(alu2);
        alu1.menorQue(alu2);

        pro1.igualque(pro2);
        pro1.mayorIgualQue(pro2);
        pro1.menorIgualQue(pro2);
        pro1.mayorQue(pro2);
        pro1.menorQue(pro2);



    }


}
