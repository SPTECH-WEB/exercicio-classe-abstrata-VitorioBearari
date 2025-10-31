package school.sptech;

public class Circulo extends Figura {
    private Double raio;

    @Override
    public Double calcularArea() {
        return (raio*raio) * Math.PI;
    }

    @Override
    public String toString(){
        return "Circulo: Raio: "+raio+" | cor: "+getCor()+" | espessura: "+ getEspessura();
    }

    public Double getRaio() {
        return raio;
    }

    public void setRaio(Double raio) {
        this.raio = raio;
    }
}
