package br.com.utfpr.gerenciamento.server.service;

import br.com.utfpr.gerenciamento.server.model.Pais;

import java.util.List;

public interface PaisService extends CrudService<Pais, Long> {

    List<Pais> paisComplete(String query);
}
