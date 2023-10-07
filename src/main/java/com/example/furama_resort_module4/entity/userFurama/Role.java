package com.example.furama_resort_module4.entity.userFurama;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;

//   các đối tượng trong set không trùng nhau nên dùng set
    @ManyToMany(fetch = FetchType.EAGER)
    // fetch = FetchType.EAGER khử đệ quy
//    @JsonBackReference
    @JoinTable(
            // tên table mình muốn tạo ra,many to many tạo ra bảng mới
            name = "user_role",
            joinColumns = @JoinColumn(name = "role_id"),
            inverseJoinColumns = @JoinColumn(name = "user_id")
    )
    private Set<User> userSet;
}
