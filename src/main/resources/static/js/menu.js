document.addEventListener("DOMContentLoaded", function () {
    const dropdowns = document.querySelectorAll(".dropdown-btn");

    dropdowns.forEach((btn) => {
        btn.addEventListener("click", function (e) {
            const currentSubmenu = this.nextElementSibling;
            const arrow = this.querySelector(".arrow");

            // Verifica si este botón pertenece a un menú raíz (<li> directamente bajo .menu)
            const parentLi = this.parentElement;
            const isRootMenu = parentLi.parentElement.classList.contains("menu");

            if (isRootMenu) {
                // Cierra todos los submenús raíz (menos el actual)
                document.querySelectorAll(".menu > li > ul").forEach((submenu) => {
                    if (submenu !== currentSubmenu) {
                        submenu.style.display = "none";
                        const icon = submenu.previousElementSibling.querySelector(".arrow");
                        if (icon) icon.classList.remove("rotate");
                    }
                });
            }

            // Cierra todos los subsubmenús hermanos si existen
            if (!isRootMenu) {
                const siblings = parentLi.parentElement.querySelectorAll("ul");
                siblings.forEach((submenu) => {
                    if (submenu !== currentSubmenu) {
                        submenu.style.display = "none";
                        const icon = submenu.previousElementSibling.querySelector(".arrow");
                        if (icon) icon.classList.remove("rotate");
                    }
                });
            }

            // Alternar visibilidad del submenú actual
            if (currentSubmenu && currentSubmenu.tagName.toLowerCase() === 'ul') {
                const isVisible = currentSubmenu.style.display === "block";
                currentSubmenu.style.display = isVisible ? "none" : "block";
                if (arrow) arrow.classList.toggle("rotate", !isVisible);
            }
        });
    });
});