from django.db import models
from django.contrib.auth.models import AbstractBaseUser, AbstractUser 


class User(models.Model):
    username = models.CharField(max_length=50)
    email = models.EmailField()
    password = models.CharField(max_length=256)
    
    def __str__(self):
        return f"<User: {self.username}>"