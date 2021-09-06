using Microsoft.EntityFrameworkCore;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace CRUD_CadastroProduto.Models
{
    public class Contexto : DbContext
    {
        public DbSet<Produto> Produtos { get; set; }

        public Contexto(DbContextOptions<Contexto> opcoes) : base(opcoes) 
        {

        }
    }
}
