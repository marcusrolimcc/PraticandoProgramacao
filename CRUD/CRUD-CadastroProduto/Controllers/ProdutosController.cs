using CRUD_CadastroProduto.Models;
using Microsoft.AspNetCore.Mvc;
using Microsoft.EntityFrameworkCore;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace CRUD_CadastroProduto.Controllers
{
    public class ProdutosController : Controller
    {
        private readonly Contexto _contexto;

        public ProdutosController(Contexto contexto)
        {
            _contexto = contexto;
        }

        public async Task<IActionResult> Index()
        {
            return View(await _contexto.Produtos.ToListAsync());
        }

        [HttpGet]
        public IActionResult CriarProduto()
        {
            return View();
        }
        [HttpPost]
        public async Task<IActionResult> CriarProduto(Produto produto)
        {
            if (ModelState.IsValid)
            {
                _contexto.Add(produto);
                await _contexto.SaveChangesAsync();
                return RedirectToAction(nameof(Index));
            }
            else return View(produto);
        }

        [HttpGet]
        public IActionResult AtualizarProduto(int? id)
        {
            if (id != null)
            {
                Produto produto = _contexto.Produtos.Find(id);
                return View(produto);
            }
            else return NotFound();
        }
        [HttpPost]
        public async Task<IActionResult> AtualizarProduto(int? id, Produto produto)
        {
            if (id != null)
            {
                if (ModelState.IsValid)
                {
                    _contexto.Update(produto);
                    await _contexto.SaveChangesAsync();
                    return RedirectToAction(nameof(Index));
                }
                else return View(produto);
            }
            else return NotFound();
        }

        [HttpGet]
        public IActionResult ExcluirProduto(int? id)
        {
            if (id != null)
            {
                Produto produto = _contexto.Produtos.Find(id);
                return View(produto);
            }
            else return NotFound();
        }
        [HttpPost]
        public async Task<IActionResult> ExcluirProduto(int? id, Produto produto)
        {
                if(id != null)
                {
                    _contexto.Remove(produto);
                    await _contexto.SaveChangesAsync();
                    return RedirectToAction(nameof(Index));
                }
                else
                {
                return NotFound();
                }
        }
    }
}
