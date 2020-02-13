package Practica2;

public class Persona {

    String name;
    String matricula;

    public Persona(String name,String matricula)
    {
        this.name=name;
        this.matricula=matricula;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

}

