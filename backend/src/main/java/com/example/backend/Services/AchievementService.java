package com.example.backend.Services;

import com.example.backend.DTOs.AchievementDTO;
import com.example.backend.entities.Achievement;
import com.example.backend.requests.AchievementRequest;
import com.example.backend.serviceInterfaces.AchievementServiceInterface;

public class AchievementService implements AchievementServiceInterface {
    @Override
    public String addAchievement(Achievement achievement) {
        return null;
    }

    @Override
    public String updateAchievement(AchievementDTO updatedAchievement) {
        return null;
    }

    @Override
    public String deleteAchievement(AchievementRequest achievement) {
        return null;
    }

    @Override
    public String getAchievements() {
        return null;
    }
}
