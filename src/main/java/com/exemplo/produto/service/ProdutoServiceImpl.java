package com.exemplo.produto.service;

import com.exemplo.produto.Produto;
import com.exemplo.produto.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

@Service
public class ProdutoServiceImpl extends ProdutoService {

    private final ProdutoRepository produtoRepository;

    @Autowired
    public ProdutoServiceImpl(ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }

    @Override
    public List<Produto> listarProdutos() {
        return produtoRepository.findAll();
    }

    @Override
    public Produto adicionarProduto(Produto produto) {
        return produtoRepository.save(produto);
    }

    @Override
    public boolean excluirProdutoPorId(Long id) {
        if (produtoRepository.existsById(id)) {
            produtoRepository.deleteById(id);
            return true;
        }
        return false;
    }

    @Override
    public List<Produto> filtrarPorPreco(double precoMinimo) {
        return produtoRepository.findByPrecoGreaterThan(precoMinimo);
    }

    @Override
    public Page<Produto> listarProdutosPaginados(Pageable pageable) {
        return produtoRepository.findAll(pageable);
    }
}
