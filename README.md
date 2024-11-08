# Gestor de Tareas

Una aplicación de gestión de tareas construida con **Spring Boot** y **Thymeleaf** que permite a los usuarios registrar, listar y eliminar tareas.

## Características

- **Inicio:** Pantalla de bienvenida con opción para registrar una nueva tarea.
- **Registrar Tarea:** Formulario para crear una nueva tarea con nombre, descripción y fecha de inicio.
- **Listado de Tareas:** Muestra todas las tareas registradas en una tabla, con opción para eliminar cada tarea.

## Estructura de la Aplicación

- **Controlador (`TaskController`):** Gestiona las rutas de la aplicación para crear, listar y eliminar tareas.
- **Servicio (`TaskService`):** Contiene la lógica de negocio para manipular las tareas.
- **Modelo (`Task`):** Representa la entidad `Task` con atributos como nombre, descripción y fecha de inicio.

## Rutas Principales

- `/` - Página de inicio
- `/task/new` - Formulario para crear una nueva tarea
- `/tasks` - Listado de todas las tareas
- `/task/delete/{id}` - Eliminar una tarea por su ID (requiere método DELETE)

## Requisitos Previos

- **Java 17** o superior
- **Maven**
- **Spring Boot** (con MyBatis y H2 para la base de datos en memoria)

## Instrucciones para Ejecutar

1. Clona el repositorio:
   ```bash
   git clone https://github.com/JesusRamirezB/task.git
   cd gestor-tareas
