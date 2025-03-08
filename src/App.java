package src;

public class App {
    public static void main(String[] args) {

        Tarefa tarefas = new Tarefa();

        tarefas.AdicionandoTarefa("correr");
        tarefas.AdicionandoTarefa("nadar");
        tarefas.AdicionandoTarefa("beber agua");

        System.out.println(tarefas);
    }
}
