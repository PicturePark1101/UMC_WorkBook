package umc.week07.demo.domain;

import jakarta.persistence.*;
import lombok.*;
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
public class Mission extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

//    private String address;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "mission_address")
    private Restaurant missionAddress;

    private LocalDate deadLine;

    private Integer rewardPoint;

    private Integer isCompleted;

    @OneToMany(mappedBy = "missionId", cascade = CascadeType.ALL)
    private List<MemberMission> memberMissionList = new ArrayList<>();
}
