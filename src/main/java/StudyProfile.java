public enum StudyProfile {
    /*  Специальности   */;
    enum Spec {
        IT("Информационные технологии"),
        ENERGY("Энергетика"),
        COOKING("Кулинария"),
        MEDICAL("Медицина");

        private String profileName;
        Spec (String profileName) {
            this.profileName = profileName;
        }

        public String getSpec() { return profileName; }
    }
}
