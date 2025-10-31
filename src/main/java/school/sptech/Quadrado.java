package school.sptech;

public class Quadrado extends Figura {
    private Double lado;

    @Override
    public Double calcularArea(){
        return lado*lado;
    }

    @Override
    public String toString(){
        return "Quadrado: Lado: "+lado+" | cor: "+getCor()+" | espessura: "+ getEspessura();
    }

    public Double getLado() {
        return lado;
    }

    public void setLado(Double lado) {
        this.lado = lado;
    }
}
