import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SistemaRecomendacaoAdapter {
    public List<Item> recomendarItens(Usuario usuario, Biblioteca biblioteca) {
        List<Item> todosItens = biblioteca.getItensAlugaveis();
        List<Item> itensRecomendados = new ArrayList<>();
        
        for (Item item : todosItens) {
            double pontuacaoFinal = calcularPontuacaoFinal(item, usuario);
            item.setPontuacao(pontuacaoFinal);
        }

        Collections.sort(todosItens);

        int numItensRecomendados = Math.min(3, todosItens.size());
        for (int i = 0; i < numItensRecomendados; i++) {
            itensRecomendados.add(todosItens.get(i));
        }

        return itensRecomendados;
    }

    private double calcularPontuacaoFinal(Item item, Usuario usuario) {
        // Pesos
        double pesoInteresse = 0.5;
        double pesoCurso = 0.2;
        double pesoHistorico = 0.3;
        double pesoFinal = 0;
        // Pontuações dos fatores
        double pontuacaoInteresse = calcularPontuacaoInteresse(item, usuario);
        double pontuacaoCurso = calcularPontuacaoCurso(item, usuario);
        double pontuacaoHistorico = calcularPontuacaoHistorico(item, usuario);

        // Calcular pontuação final ponderada
        pesoFinal=(pesoInteresse * pontuacaoInteresse) + (pesoCurso * pontuacaoCurso) + (pesoHistorico * pontuacaoHistorico);
        return pesoFinal;
    }

    // Métodos para calcular as pontuações dos fatores (interesse, curso, histórico)
    private double calcularPontuacaoInteresse(Item item, Usuario usuario) {
    	double pontuacao = 0;
			if(usuario.getCategoriasDeInteresse().contains(item.getTema())) {
				pontuacao=1;
			}

        return pontuacao;
    }

    private double calcularPontuacaoCurso(Item item, Usuario usuario) {
    	double pontuacao = 0;
			if(usuario.getCurso().equals(item.getTema())) {
				pontuacao=1;
			}

        return pontuacao;
    }

    private double calcularPontuacaoHistorico(Item item, Usuario usuario) {
    	double pontuacao = 0;
		if(usuario.obterHistoricoDeItensAlugados().contains(item)) {
			pontuacao=1;
		}
        return pontuacao;
    }
}
