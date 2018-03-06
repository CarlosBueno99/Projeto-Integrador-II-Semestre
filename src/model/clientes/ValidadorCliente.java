
package model.clientes;
import model.clientes.Cliente;
import exceptions.ClienteException;
public class ValidadorCliente {
    public static  void validar(Cliente cliente) throws ClienteException, Exception {
        if (cliente == null) {
            throw new ClienteException("Não foi informado um cliente");
        }
        else if (cliente.getNome() == null || "".equals(cliente.getNome())) {
            throw new ClienteException("É necessário informar "
                    + "um nome de cliente");
        }
//       else  if (cliente.getRG() == null
//                || "  .   .   - ".equals(cliente.getRG())) {
//            throw new ClienteException("É necessário informar um "
//                    + "RG do cliente");
//        }
       else  if (cliente.getCPF() == null
                || "   .   .   -  ".equals(cliente.getCPF())) {
            throw new ClienteException("É necessário informar um "
                    + "CPF do cliente");
       }
       else if (cliente.getGenero() == null || "".equals(cliente.getGenero())
                || (!cliente.getGenero().equals("Masculino"))
                && !cliente.getGenero().equals("Feminino")) {
            throw new ClienteException("É necessário informar o "
                    + "gênero do cliente");
        }
//       else if (cliente.getCEP() == null || "     -   ".equals(cliente.getCEP())) {
//            throw new ClienteException("É necessário informar "
//                    + "um número  para o CEP do cliente");
//        }
      else   if (cliente.getData_nascimento() == null || "  /  /    ".equals(cliente.getData_nascimento())) {
            throw new ClienteException("É necessário informar uma "
                    + "data de nascimento válida");
        }
      else   if (cliente.getEndereco() == null || "".equals(cliente.getEndereco())) {
            throw new ClienteException("É necessário informar "
                    + "um endereço de cliente");
        }
        else   if (cliente.getN_casa() == null || "".equals(cliente.getN_casa())) {
            throw new ClienteException("É necessário informar "
                    + "um número para a residência do cliente");
        }
      
//      else       if (cliente.getComplemento() == null || "".equals(cliente.getComplemento())) {
//            throw new ClienteException("É necessário informar "
//                    + "um complemento para a residência do cliente");
//        }
       else      if (cliente.getBairro() == null || "".equals(cliente.getBairro())) {
            throw new ClienteException("É necessário informar "
                    + "um bairro para a residência do cliente");
        }
       else      if (cliente.getCidade() == null || "".equals(cliente.getCidade())) {
            throw new ClienteException("É necessário informar "
                    + "uma cidade para o cliente");
        }
       else       if (cliente.getUF() == null || "".equals(cliente.getUF())) {
            throw new ClienteException("É necessário informar "
                    + " UF para o cliente");
    }
//        else      if (cliente.getTelefone_casa() == null || "+   (  )     -    ".equals(cliente.getTelefone_casa())) {
//            throw new ClienteException("É necessário informar "
//                    + " o número de telefone para o cliente");
//    }
//        else      if (cliente.getTelefone_celular() == null || "+   (  )      -    ".equals(cliente.getTelefone_celular())) {
//            throw new ClienteException("É necessário informar "
//                    + " o número de celular para o cliente");
//    }
//       else if (cliente.getEmail() == null || "".equals(cliente.getEmail())) {
//            throw new ClienteException("É necessário informar "
//                    + " um email para concluir o cadastro do cliente! ");
//    }
}
}