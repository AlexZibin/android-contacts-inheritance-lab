package ru.yandex.practicum.contacts.presentation.sort;

import androidx.annotation.NonNull;

import ru.yandex.practicum.contacts.presentation.base.ContactsOrderTypeUi;

public class SortTypeUI extends ContactsOrderTypeUi {

    public SortTypeUI (String type, boolean isSelected) {super (type, isSelected);}
     public String createLogMessage() {
        return "Выбран тип сортировки: " + getType();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        SortTypeUI that = (SortTypeUI) o;

        if (isSelected() != that.isSelected()) {
            return false;
        }
        return getType().equals(that.getType());
    }

    @Override
    public int hashCode() {
        int result = getType().hashCode();
        result = 31 * result + (isSelected() ? 1 : 0);
        return result;
    }
}
