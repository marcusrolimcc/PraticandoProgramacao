using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace CRUD_CadastroProduto.Models
{
    public class Produto
    {
        public int ProdutoId { get; set; }
        public string Descricao { get; set; }
        public DateTime Vencimento { get; set; }
        public int Quantidade { get; set; }
        public double Preco { get; set; }
    }
}
