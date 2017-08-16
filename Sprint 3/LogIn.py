urls.py:
# HomeView is a simple TemplateView that displays post-login options
urlpatterns = patterns('',
    ...
    url(r'^myapp/$', HomeView.as_view(template_name='home.html'), name='home'),
    url(r'^accounts/login/$', 'django.contrib.auth.views.login', name='login'),
    url(r'^accounts/logout/$', 'django.contrib.auth.views.logout', name='logout'),
    ...
)

settings.py:
from django.core.urlresolvers import reverse_lazy
...
LOGIN_URL = reverse_lazy('login')
LOGIN_REDIRECT_URL = reverse_lazy('home')

templates/registration:
login.html:
{% extends "base.html" %}
{% block head %}
<title>Login</title>
{% endblock %}
{% block body %}
{% if form.errors %}
<p>Your username and password didn't match. Please try again.</p>
{% endif %}
<form method="post" action="{% url 'django.contrib.auth.views.login' %}">
{% csrf_token %}
<table>
<tr>
    <td>{{ form.username.label_tag }}</td>
    <td>{{ form.username }}</td>
</tr>
<tr>
    <td>{{ form.password.label_tag }}</td>
    <td>{{ form.password }}</td>
</tr>
</table>
<input type="submit" value="login" />
<input type="hidden" name="next" value="{{ next }}" />
</form>
{% endblock %}

logged_out.html:
{% extends "base.html" %}
{% block head %}
<title>Logged out</title>
{% endblock %}
{% block body %}
<p>You have been logged out.  You may <a href="{% url 'login' %}">log back in</a>.</p>
{% endblock %}