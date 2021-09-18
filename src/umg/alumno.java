package umg;

public class alumno implements comprador{
    public int Edad;
    private String Carnet;
    private String nombreAlumno;

    public alumno() {
    }

    public alumno(int Edad, String Carnet, String nombreAlumno) {
        this.Edad = Edad;
        this.Carnet = Carnet;
        this.nombreAlumno = nombreAlumno;
    }


    public boolean menorQue(Object q) {
        alumno a = (alumno)q;
        return this.Edad < a.Edad;
    }


    public boolean mayorQue(Object q) {
        alumno a = (alumno)q;
        return this.Edad > a.Edad;
    }


    public boolean menorIgualQue(Object q) {
        alumno a = (alumno)q;
        return this.Edad <= a.Edad;
    }


    public boolean mayorIgualQue(Object q) {
        alumno a = (alumno)q;
        return this.Edad >= a.Edad;
    }


    public boolean igualque(Object q) {
        alumno a = (alumno)q;
        return this.Edad == a.Edad;
    }




}
