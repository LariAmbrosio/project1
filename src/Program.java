public class Program {
    public static void main(String[] args) {
        Produto papel1 = new Produto();
        papel1.setCodigo("01");
        papel1.setModelo("A4");
        papel1.setMarca("Canon");
        papel1.setValor(10);
        papel1.setImpostoFederal(6.70);
        papel1.setImpostoProvincial(1.70);

        Produto papel2 = new Produto();
        papel2.setCodigo("02");
        papel2.setModelo("A3");
        papel2.setMarca("HP");
        papel2.setValor(15);
        papel2.setImpostoFederal(4.50);
        papel2.setImpostoProvincial(1.70);

        Produto papel3 = new Produto();
        papel3.setCodigo("03");
        papel3.setModelo("A5");
        papel3.setMarca("OfficeJet");
        papel3.setValor(11);
        papel3.setImpostoFederal(2.10);
        papel3.setImpostoProvincial(1.70);


        Registradora reg = new Registradora();
        reg.addProduto(papel1);
        reg.addProduto(papel2);
        reg.addProduto(papel3);
        System.out.println(reg.getTotal());

        System.out.println(reg.getNomeDoProduto(papel1));
        System.out.println(reg.getNomeDoProduto(papel2));
        System.out.println(reg.getNomeDoProduto(papel3));

        Boleto boleto = new Boleto();
        System.out.println("Vencimento: " + boleto.getVencimento());
        boleto.setValor(reg.getTotal());
        System.out.println("Valor a pagar: " + boleto.getValor());
        boleto.setComprador("Larissa");
        System.out.println(boleto.getComprador());
    }
}

