package odontohealth;

import java.util.Date;

public class Main {

    public static void main(String[] args) {

        Dentista dentista = new Dentista("Dr. Fulano", "99999-9999", "Rua das Lamentações, 123", "123.456.789-00", 45, "12345-CRO", "Ortodontia", 12000.0);

        Paciente paciente = new Paciente("Anderson Iwazaki", "88888-8888", "Rua Antony, 456", "987.654.321-00", 30, 101);

        Prontuario prontuario = new Prontuario(1, paciente, "Histórico limpo", "Nenhuma alergia", null);

        Agenda agenda = new Agenda(new Date());
        agenda.cancelarConsulta();

        Atendimento atendimento = new Atendimento(1, null, 0, "Paciente com dor de dente. Realizado procedimento.", paciente);
        atendimento.realizarAtendimento();
        atendimento.encerrarAtendimento();

        Dinheiro pagamentoDinheiro = new Dinheiro(0, 150.0);
        pagamentoDinheiro.pagarConsulta();
        pagamentoDinheiro.devolverTroco();

        PagamentoCartao pagamentoCartao = new PagamentoCartao("1234 5678 9012 3456", new Date(), "987.654.321-00", "Anderson Iwazaki", 123);
        pagamentoCartao.escolherCredito();
        pagamentoCartao.pagarConsulta();
        pagamentoCartao.cancelarPagamento();

        prontuario.apresentarDetalhes();
    }
    Dentista dentista = new Dentista("Dr. Fulano", "99999-9999", "Rua das Lamentações, 123", "123.456.789-00", 45, "12345-CRO", "Ortodontia", 12000.0);

    Paciente paciente = new Paciente("Anderson Iwazaki", "88888-8888", "Rua Antony, 456", "987.654.321-00", 30, 101);

    Prontuario prontuario = new Prontuario(1, paciente, "Histórico limpo", "Nenhuma alergia", null);

    Agenda agenda = new Agenda(new Date());
    agenda.cancelarConsulta();

    Atendimento atendimento = new Atendimento(1, null, 0, "Paciente com dor de dente. Realizado procedimento.", paciente);
  atendimento.realizarAtendimento();
    atendimento.encerrarAtendimento();

    Dinheiro pagamentoDinheiro = new Dinheiro(0, 150.0);
pagamentoDinheiro.pagarConsulta();
  pagamentoDinheiro.devolverTroco();

    PagamentoCartao pagamentoCartao = new PagamentoCartao("1234 5678 9012 3456", new Date(), "987.654.321-00", "Anderson Iwazaki", 123);
   pagamentoCartao.escolherCredito();
   pagamentoCartao.pagarConsulta();
    pagamentoCartao.cancelarPagamento();
    prontuario.apresentarDetalhes();

	}

}


