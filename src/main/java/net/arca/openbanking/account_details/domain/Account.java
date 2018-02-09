package net.arca.openbanking.account_details.domain;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
@Entity
@Table(name = "account")
public class Account {
    @Id
    @Column(name = "account_id")
    private String accountId;
    @Column(name = "account_no")
    private String accountNo;
    @Column(name = "username")
    private String username;
    @Column(name = "clientId")
    private String clientId;
    @Column(name = "branch_code")
    private String branchCode;
    @Column(name = "created_date")
    private String createdDate;
}