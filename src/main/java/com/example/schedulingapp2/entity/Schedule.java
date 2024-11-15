package com.example.schedulingapp2.entity;

import jakarta.persistence.*;
import lombok.Getter;

@Entity
@Table(name = "schedule")
@Getter
public class Schedule extends BaseEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String username;

    @Column(nullable = false)
    private String title;

    @Column(columnDefinition = "longtext")
    private String contents;

    @ManyToOne
    @JoinColumn(name = "member_id")
    private Member member;

    public Schedule(String username, String title, String contents) {
        super();
        this.username = username;
        this.title = title;
        this.contents = contents;
    }

    public Schedule() {
    }
}
