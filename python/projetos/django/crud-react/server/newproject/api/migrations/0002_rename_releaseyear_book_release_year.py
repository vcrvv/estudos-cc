# Generated by Django 5.0.7 on 2024-09-25 18:24

from django.db import migrations


class Migration(migrations.Migration):

    dependencies = [
        ('api', '0001_initial'),
    ]

    operations = [
        migrations.RenameField(
            model_name='book',
            old_name='releaseYear',
            new_name='release_year',
        ),
    ]
