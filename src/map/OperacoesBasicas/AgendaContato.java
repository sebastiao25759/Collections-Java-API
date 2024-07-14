package map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContato {
    private Map<String, Integer> agendaContatosMap;

    public AgendaContato() {
        agendaContatosMap = new HashMap<>();
    }

    public void adicionaContato(String nome, Integer telefone) {
        agendaContatosMap.put(nome, telefone);
    }

    public void removerContato(String nome) {
        if(!agendaContatosMap.isEmpty()){
            agendaContatosMap.remove(nome);
        }
    }

    public void exibirContato() {
        System.out.println(agendaContatosMap);
    }

    public Integer pesquisarPorNome(String nome) {
        Integer numeroPorNome = null;
        if(!agendaContatosMap.isEmpty()) {
            numeroPorNome = agendaContatosMap.get(nome);
        }
        return numeroPorNome;
    }

    public static void main(String[] args) {
        AgendaContato agendaContatos = new AgendaContato();

        agendaContatos.exibirContato();

        agendaContatos.adicionaContato("A", 95888262);
        agendaContatos.adicionaContato("S", 848895528);
        agendaContatos.adicionaContato("C", 48484848);
        agendaContatos.adicionaContato("teste", 848484);
        agendaContatos.exibirContato();

        System.out.println(agendaContatos.pesquisarPorNome("C"));
        agendaContatos.removerContato("teste");
        agendaContatos.exibirContato();
    }
}