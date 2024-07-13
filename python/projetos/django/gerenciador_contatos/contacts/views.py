from django.shortcuts import render, get_object_or_404, redirect
from contacts.models import Contact

def contact_list(request):
    contacts = Contact.objects.all()
    return render(request, 'contacts/contact_list.html', {'contacts': contacts})

def contact_create(request):
    if request.method == 'POST':
        contact = Contact(name=request.POST['name'], email=request.POST['email'], phone=request.POST['phone'])
        contact.save()
        return redirect('contact_list')
    return render(request, 'contacts/contact_create.html')


def contact_update(request, pk):
    contact = get_object_or_404(Contact, pk=pk)
    if request.method == 'POST':
        contact.name = request.POST['name']
        contact.email = request.POST['email']
        contact.phone = request.POST['phone']
        contact.save()
    return redirect(request, 'contacts/contact_update.html', {'contact': contact})
    
    
def contact_delete(request, pk):
    contact = get_object_or_404(Contact, pk=pk)
    if request.method == 'POST':
        contact.delete()
        return redirect('contact_list')
    return render(request, 'contacts/contact_delete.html', {'contact': contact})
