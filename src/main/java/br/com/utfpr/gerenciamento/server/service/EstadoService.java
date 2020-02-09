package br.com.utfpr.gerenciamento.server.service;

import br.com.utfpr.gerenciamento.server.model.Estado;

import java.util.List;

public interface EstadoService extends CrudService<Estado, Long> {

    List<Estado> estadoComplete(String query);
}
