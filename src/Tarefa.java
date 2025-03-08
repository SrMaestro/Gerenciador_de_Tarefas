package src;

import java.util.ArrayList;

public class Tarefa {

    private String minhaTarefa;

    private ArrayList<String> tarefasPull;

    //Usando o contrutor dessa forma eu garanto que a minha lista de tarefas sejam criada
    public Tarefa() {
        tarefasPull = new ArrayList<>(); // Inicialização do ArrayList
    }


    public void AdicionandoTarefa(String minhaTarefa){
        tarefasPull.add(minhaTarefa);

    }

    @Override
    public String toString() {
        return "Tarefa{" +
                "minhaTarefa='" + minhaTarefa + '\'' +
                ", tarefasPull=" + tarefasPull +
                '}';
    }
}
