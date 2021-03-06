package br.com.utfpr.gerenciamento.server.model;

import br.com.utfpr.gerenciamento.server.ennumeation.StatusDevolucao;
import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = {"id"})
@Table(name = "emprestimo_devolucao_item")
public class EmprestimoDevolucaoItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "qtde", nullable = false)
    private BigDecimal qtde;

    @Enumerated(EnumType.STRING)
    @Column(name = "status", length = 1)
    private StatusDevolucao statusDevolucao;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "item_id", referencedColumnName = "id", nullable = false)
    private Item item;

    @ManyToOne
    @JsonBackReference
    @JoinColumn(name = "emprestimo_id", referencedColumnName = "id")
    private Emprestimo emprestimo;
}
