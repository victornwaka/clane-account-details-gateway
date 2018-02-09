package net.arca.openbanking.account_details.repository;

import net.arca.openbanking.account_details.domain.Account;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AccountRepo extends CrudRepository<Account, String> {

    List<Account> findByUsername(String username);

    List<Account> findByAccountNo(String accountNo);

}


