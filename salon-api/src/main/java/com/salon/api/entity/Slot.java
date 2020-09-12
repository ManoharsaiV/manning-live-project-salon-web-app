package com.salon.api.entity;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Set;

@Entity
public class Slot {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    LocalDateTime lockedAt;
    LocalDateTime confirmedAt;
    LocalDateTime slotFor;

    private SlotStatus status;

    String stylistName;

    public Slot() {
    }

    @ManyToOne
    private SalonServiceDetail selectedService;

    @ManyToMany(fetch = FetchType.EAGER)
    Set<SalonServiceDetail>  availableServices;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getLockedAt() {
        return lockedAt;
    }

    public void setLockedAt(LocalDateTime lockedAt) {
        this.lockedAt = lockedAt;
    }

    public LocalDateTime getConfirmedAt() {
        return confirmedAt;
    }

    public void setConfirmedAt(LocalDateTime confirmedAt) {
        this.confirmedAt = confirmedAt;
    }

    public LocalDateTime getSlotFor() {
        return slotFor;
    }

    public void setSlotFor(LocalDateTime slotFor) {
        this.slotFor = slotFor;
    }

    public SlotStatus getStatus() {
        return status;
    }

    public void setStatus(SlotStatus status) {
        this.status = status;
    }

    public String getStylistName() {
        return stylistName;
    }

    public void setStylistName(String stylistName) {
        this.stylistName = stylistName;
    }

    public SalonServiceDetail getSelectedService() {
        return selectedService;
    }

    public void setSelectedService(SalonServiceDetail selectedService) {
        this.selectedService = selectedService;
    }

    public Set<SalonServiceDetail> getAvailableServices() {
        return availableServices;
    }

    public void setAvailableServices(Set<SalonServiceDetail> availableServices) {
        this.availableServices = availableServices;
    }
}

enum  SlotStatus {
    AVAILABLE,LOCKED,CONFIRMED,CANCELLED
}