package com.example.backend.serviceInterfaces;

import com.example.backend.DTOs.AchievementDTO;
import com.example.backend.entities.Achievement;
import com.example.backend.requests.AchievementRequest;

public interface AchievementServiceInterface {
   String addAchievement(Achievement achievement);
   String updateAchievement(AchievementDTO updatedAchievement);

   String deleteAchievement(AchievementRequest achievement);
   String getAchievements();
}
