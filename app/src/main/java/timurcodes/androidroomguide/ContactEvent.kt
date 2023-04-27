package timurcodes.androidroomguide

sealed interface ContactEvent {
    object SaveContact : ContactEvent
    object ShowDialog : ContactEvent
    object HideDialog : ContactEvent

    data class SetFirstName(val firstName: String) : ContactEvent
    data class SetLastName(val lastName: String) : ContactEvent
    data class SetPhoneNumberName(val phoneNumber: String) : ContactEvent
    data class DeleteContact(val contact: Contact) : ContactEvent

    data class SetSortType(val type: SortType) : ContactEvent
}