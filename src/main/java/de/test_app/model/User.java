package de.test_app.model;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * --- User Model for login system ---
 * <p>
 * H2:
 *
 * @Entity - Spring Boot and H2 will crate a table with the given variables.
 * @Id - Necessary for H2 database table (every entry has its own ID)
 * @GeneratedValue - ID will be generated automatically
 * <p>
 * Lombok:
 * @Data - Lombok will create getter/setter/toString methods
 * @NoArgsConstructor - Creates Class Constructor
 * <p>
 * validation:
 * @NotNull - May not be null
 */

@Entity
@NoArgsConstructor
@Data
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Size(min = 5, max = 25)
    @Column(unique = true)
    private String username;

    @Size(min = 5, max = 60)
    private String password;

    @NotNull
    private boolean enabled;

    @NotNull
    @Enumerated(EnumType.STRING)
    private Role role;

    @Builder
    public User(Long id, String username, String password, boolean enabled, Role role) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.enabled = enabled;
        this.role = role;
    }
}