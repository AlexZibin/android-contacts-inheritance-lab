package ru.yandex.practicum.contacts.presentation.base;

public class ContactsOrderTypeUi {
    protected String type;
    protected boolean isSelected;

    public ContactsOrderTypeUi (String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

}
