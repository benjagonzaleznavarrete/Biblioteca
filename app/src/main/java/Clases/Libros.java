package Clases;

public class Libros {

    private String farenheit;
    private String revival;
    private String elalquimista;
    private String elpoder;
    private String despertar;

    public Libros()
    {
        farenheit="7000";
        revival="22000";
        elalquimista="45000";
        elpoder="88000";
        despertar="156000";
    }

    public String getFarenheit()
    {
        return farenheit;
    }

    public String getRevival()
    {
        return revival;
    }

    public String getElalquimista(){return elalquimista;}

    public String getElpoder() {
        return elpoder;
    }

    public String getDespertar() {
        return despertar;
    }
}
