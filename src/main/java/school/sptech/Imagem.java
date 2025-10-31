package school.sptech;

import java.util.ArrayList;
import java.util.List;

public class Imagem {
    private List<Figura> figuras;

    public void adicionar(Figura figura){
        figuras.add(figura);
    }

    public Double calcularSomaDasAreas(){
        Double Soma = 0.0;
        for(Figura fig : figuras){
            Soma += fig.calcularArea();
        }
        return Soma;
    }

    public List<Figura> buscarPorAreaMaiorQue20(){
        List<Figura> resultado = new ArrayList<>();
        for(Figura fig : figuras){
            if(fig.calcularArea() > 20){
                resultado.add(fig);
            }
        }
        return resultado;
    }

    public List<Figura> buscarQuadrados(){
        List<Figura> resultado = new ArrayList<>();
        for(Figura fig : figuras){
            if(fig instanceof Quadrado){
                resultado.add(fig);
            }
        }
        return resultado;
    }
}
