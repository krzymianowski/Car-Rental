# Car-Rental

Aplikacja wykonywana w ramach pracy inżynierskiej.  
Temat: Aplikacja wspierająca pracę wypożyczalni samochodów.

Stan na: 05.10.2018

### Wykorzystane technologie:

- Java
- Tomcat
- Project Lombok
- Maven
- Spring Framework
- Spring Boot
- Spring Security
- MySQL
- JPA - Hibernate
- JSP, JSTL
- Frontend
  - Bootstrap 4
  - jQuery
  - Html
  - SCSS, CSS
  - bcSwipe.js
- Środowisko programistyczne: IntelliJ IDEA

### Aplikacja:

Wszystkie strony są responsywne i wyświetlają się poprawnie na urządzeniach mobilnych.

#### Home Page:

Strona główna aplikacji. Poza podstawową treścią strony (Która w przyszłości będzie mogła być edytowana z poziomu panelu sterowania), na stronie wyświetlane jest 8 losowych samochodów z bazy danych, oraz dostępny jest formularz dołączenia do newsletteru. Nowi subskrybenci zapisywani są do bazy danych a w przyszłości będzie możliwość wysyłania do nich wiadomości z poziomu panelu sterowania.

![Home Page](https://i.imgur.com/ZpwvhkK.png)
<br/><br/><br/>

#### Check Our Cars Page:

Na stronie wyświetlane są wszystkie samochody znajdujące się w bazie danych. Użytkownik ma możliwość wyszukiwania samochodów po określonym typie, marce, modelu, rodzaju paliwa oraz sortowania wyników.

![Check Our Cars](https://i.imgur.com/aTuBhBo.png)
<br/><br/><br/>

#### About Us Page:

Prosta strona zawierająca informacje o firmie. W przyszłości treść strony będzie możliwa do edycji z poziomu panelu sterowania.

![About Us](https://i.imgur.com/EZ3HG6C.png)
<br/><br/><br/>

#### Contact Page:

Strona zawiera informacje kontaktowe oraz formularz kontaktowy, za pomocą którego użytkownik może poprosić o kontakt. Wiadomości zapisywane są w bazie danych a w przyszłości będą widoczne w panelu sterowania.

![Contact](https://i.imgur.com/1eVrsfP.png)
<br/><br/><br/>

#### Login Page:

Prosta strona logowania wyświetlana przy próbie dostępu do panelu sterowania przez nieautoryzowanego użytkownika (lub poprzez link /login). W formularzu wyświetlane są informacje o błędach logowania oraz informacja o wylogowaniu użytkownika.

![Login](https://i.imgur.com/1a5dtzV.png)
<br/><br/><br/>

#### Control Panel Page:

Strona panelu sterowania, w której użytkownicy w oparciu o przydzielone im role będą mieli dostęp do funkcjonalności strony tj. zarządzanie samochodami, wypożyczanie samochodów, wysyłanie wiadomości, edycja treści strony, dodawanie użytkowników itp. Strona nie jest jeszcze gotowa.

![Control Panel](https://i.imgur.com/YcxVz2T.png)
<br/><br/><br/>

### Do zrobienia:

- Control Panel:
  - Dodawanie samochodów
  - Edycja samochodów
  - Usuwanie samochodów
  - Dodawanie użytkowników
  - Edycja użytkowników
  - Usuwanie użytkowników
  - Szczegółowe wyszukiwanie samochodu
  - Dodawanie klienta
  - Wyszukiwanie klientów
  - Wypożyczanie samochodu
  - Powiadomienia o samochodach
  - Kontakty
  - Obsługa newsletteru
  - Edycja zawartości strony
  - Inne
- Integracja z AWS

### Struktura projektu:

- pom.xml
- src/main/
  - java/com/krzymianowski/application/
    - configuration/
      - SecurityConfig.class
      - SpringConfig.class
    - controller/
      - AboutUsController.class
      - CarDetailsController.class
      - ContactController.class
      - ControlPanelController.class
      - HomeController.class
      - ImagesController.class
      - LoginController.class
      - OurCarsController.class
    - exception/
      - NewsletterSubscriberAlreadyExistsException.class
      - RoleAlreadyExistsException.class
      - StorageException.class
      - StorageFileNotFoundException.class
      - StorageInvalidImageFormatException.class
      - UserAlreadyExistsException.class
    - model/
      - authentication/
        - repository/
          - RoleRepository.class
          - UserRepository.class
        - Role.class
        - User.class
      - car/
        - projection/
          - CarDetailsPageCar.class
          - CarDetailsPageEquipment.class
          - CarDetailsPageImage.class
          - HomePageCar.class
          - OurCarsPageBrand.class
          - OurCarsPageCar.class
          - OurCarsPageFuelType.class
          - OurCarsPageModel.class
          - OurCarsPageType.class
        - repository/
          - BrandRepository.class
          - CarRepository.class
          - ColorRepository.class
          - DrivingGearRepository.class
          - EquipmentRepository.class
          - FuelTypeRepository.class
          - ImageRepository.class
          - ModelRepository.class
          - StateRepository.class
          - TransmissionRepository.class
          - TypeRepository.class
        - Brand.class
        - Car.class
        - Color.class
        - DrivingGear.class
        - Equipment.class
        - FuelType.class
        - Image.class
        - Model.class
        - Rating.class
        - State.class
        - Transmission.class
        - Type.class
      - contact/
        - repository/
          - ContactStateRepository.class
          - WantToContactRepository.class
        - view_model/
          - ContactForm.class
        - ContactState.class
        - WantToContact.class
      - newsletter/
        - repository/
          - SubscriberRepository.class
        - view_model/
          - NewsletterForm.class
        - Subscriber.class
    - service/
      - authentication/
        - impl/
          - RoleServiceImpl.class
          - UserServiceImpl.class
        - RoleService.class
        - UserService.class
      - car/
        - impl/
          - BrandServiceImpl.class
          - CarServiceImpl.class
          - ColorServiceImpl.class
          - DrivingGearServiceImpl.class
          - EquipmentServiceImpl.class
          - FuelTypeServiceImpl.class
          - ImageServiceImpl.class
          - ModelServiceImpl.class
          - StateServiceImpl.class
          - TransmissionServiceImpl.class
          - TypeServiceImpl.class
        - BrandService.class
        - CarService.class
        - ColorService.class
        - DrivingGearService.class
        - EquipmentService.class
        - FuelTypeService.class
        - ImageService.class
        - ModelService.class
        - StateService.class
        - TransmissionService.class
        - TypeService.class
      - contact/
        - impl/
          - ContactStateServiceImpl.class
          - WantToContactServiceImpl.class
        - ContactStateService.class
        - WantToContactService.class
      - newsletter/
        - impl/
          - SubscriberServiceImpl.class
        - SubscriberService.class
      - storage/
        - impl/
          - FileSystemStorageService.class
        - StorageService.class
    - CarRentalApplication.class
    - InitTempData.class
  - resources/
    - application.properties
  - webapp/
    - css/
      - about-us.css
      - admin-panel.css
      - bootstrap.css
      - car-details.css
      - contact.css
      - home-page.css
      - login-page.css
      - our-cars.css
      - style.css
    - img/
      - temp-car-2.jpg
      - temp-car-3.jpg
      - temp-car.jpg
      - temp-logo.png
      - temp-person.jpg
    - js/
      - bootstrap.min.js
      - jquery-3.3.1.min.js
      - jquery.bcSwipe.min.js
      - popper.min.js
    - WEB-INF/
      - about-us.jsp
      - car-details.jsp
      - contact.jsp
      - control-panel.jsp
      - home-page.jsp
      - login-page.jsp
      - our-cars.jsp
      - temp-file-upload.jsp
- upload/
  - {car_id}/
    - {car_images}
  - users/
    - {user_id}/
      - {user_images}
    - temp-person.jpg
  - no-image.jpg
