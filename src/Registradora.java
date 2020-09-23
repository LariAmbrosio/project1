public class Registradora {
            private double total;


            public void addProduto(Produto produto){
                total = total + produto.getValor() + produto.getImpostoFederal() + produto.getImpostoProvincial();
    }
            public double getTotal(){
                return total;

            }
            public String getNomeDoProduto(Produto produto){
                String nomeDoProduto = produto.getCodigo() + "/" + produto.getModelo() + "-" +produto.getMarca();
                return nomeDoProduto;
            }
}
