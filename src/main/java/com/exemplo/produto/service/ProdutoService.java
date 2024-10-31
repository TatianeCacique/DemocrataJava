package com.exemplo.produto.service;

import com.exemplo.produto.Produto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import java.util.List;

public abstract class ProdutoService {
    public abstract List<Produto> listarProdutos();

    public abstract Produto adicionarProduto(Produto produto);

    public abstract boolean excluirProdutoPorId(Long id);

    public abstract List<Produto> filtrarPorPreco(double precoMinimo);

    public abstract Page<Produto> listarProdutosPaginados(Pageable pageable);
}
