package umc.week07.demo.domain;

import jakarta.persistence.*;
import lombok.*;
import umc.week07.demo.domain.mapping.InterstFood;
import umc.week07.demo.domain.mapping.MemberMission;
import umc.week07.demo.domain.common.BaseEntity;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class Member extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    private Gender gender;

    @Enumerated(EnumType.STRING)
    private SocialType socialType;

    @Column(nullable = false, length = 20)
    private String name;

    @Column(nullable = false, length = 50)
    private String email;

    @Column(nullable = false, length = 40)
    private String address;

    private LocalDate birth;

    private Integer point;

    @OneToMany(mappedBy = "memberId", cascade = CascadeType.ALL)
    private List<Review> reviewList = new ArrayList<>();

    @OneToMany(mappedBy = "memberId", cascade = CascadeType.ALL)
    private List<InterstFood> interstFoodList = new ArrayList<>();

    @OneToMany(mappedBy = "memberId", cascade = CascadeType.ALL)
    private List<MemberMission> memberMissionList = new ArrayList<>();
}
