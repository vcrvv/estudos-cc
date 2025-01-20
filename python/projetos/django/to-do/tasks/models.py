from django.db import models

# Create your models here.

class Task(models.Model):
    id = models.AutoField(primary_key=True)
    title = models.CharField(null=False, max_length=100)
    completed = models.BooleanField(default=False)
    
    def __str__(self) -> str:
        return self.title