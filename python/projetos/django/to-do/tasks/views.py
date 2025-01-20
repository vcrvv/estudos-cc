from django.shortcuts import render, redirect, get_object_or_404
from .models import Task

def home(request):
    tasks = Task.objects.all()
    if request.method == 'POST':
        title = request.POST['title']
        if title:
            task = Task(title = title)
            task.save()

    return render(request, 'home.html', {"tasks": tasks})

def update(request, id):
    task = get_object_or_404(Task, id=id)
    task.completed = not task.completed
    task.save()
    return redirect('home')
    
def delete(request, id):
    task = get_object_or_404(Task, id=id)
    task.delete()
    return redirect('home')
