package sge.domain;

import java.time.LocalDate;

import sge.persistence.Arquivo;

public record Estudante(
  String nome, 
  String cpf, 
  String email, 
  LocalDate dtNascimento, 
  String telefone, 
  Endereco endereco, 
  String turma) {

  public String imprimir() {
    return String.format("""
      Nome: %s
      CPF: %s
      E-mail: %s
      Data de Nascimento: %s
      Telefone: %s
      Endereço: %s
      Código da Turma: %s""", nome, cpf, email, Arquivo.FORMATO_DATA.format(dtNascimento), telefone, endereco.imprime(),
       turma);
  }

}