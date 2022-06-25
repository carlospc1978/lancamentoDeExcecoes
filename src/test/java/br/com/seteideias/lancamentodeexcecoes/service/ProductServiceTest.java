package br.com.seteideias.lancamentodeexcecoes.service;

import org.junit.Assert;
import org.junit.Test;

public class ProductServiceTest {
    br.com.seteideias.lancamentodeexcecoes.service.ProductService productService= new br.com.seteideias.lancamentodeexcecoes.service.ProductService();

    @Test
    public void testListarProduto() throws Exception {
        br.com.seteideias.lancamentodeexcecoes.response.ProdutctReponse result = productService.listarProduto(new br.com.seteideias.lancamentodeexcecoes.dto.Product());
        Assert.assertEquals(new br.com.seteideias.lancamentodeexcecoes.response.ProdutctReponse(), result);
    }
}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev.com/forum#!/testme