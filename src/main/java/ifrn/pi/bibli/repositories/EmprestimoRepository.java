package ifrn.pi.bibli.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import ifrn.pi.bibli.models.Emprestimo;

public interface EmprestimoRepository extends JpaRepository<Emprestimo, Long>{

}
