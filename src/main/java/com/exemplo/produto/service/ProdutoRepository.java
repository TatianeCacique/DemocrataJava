package com.exemplo.produto.service;

import com.exemplo.produto.Produto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoRepository {

    private final com.exemplo.produto.repository.ProdutoRepository produtoRepository;

    @Autowired
    public ProdutoRepository(com.exemplo.produto.repository.ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }

    public Produto salvarProduto(Produto produto) {
        return produtoRepository.save(produto);
    }

    public List<Produto> buscarTodos() {
        return produtoRepository.findAll();
    }


}
