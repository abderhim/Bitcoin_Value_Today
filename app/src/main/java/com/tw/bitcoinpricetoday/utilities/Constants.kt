package com.tw.bitcoinpricetoday.utilities

import com.tw.bitcoinpricetoday.R


const val ACCESS_TOKEN = "ACCESS_TOKEN"
const val MARCHE_ID = "MARCHE_ID"
const val LAST_NAME = "LAST_NAME"
const val FIRST_NAME = "FIRST_NAME"
const val BIRTH_DATE = "BIRTH_DATE"
const val PHONE_NUMBER = "PHONE"
const val EMAIL = "EMAIL"
const val CRYPTED_PASSWORD = "CRYPTED_PASSWORD"
const val MARCHE_ID_CGI = 1
const val MARCHE_ID_SGB = 2
const val IS_CONJOINT = 0
const val IS_NOT_CONJOINT = 1
const val MEMORIZED_INFOS = "MEMORIZED_INFOS"
const val NOT_MEMORIZED = "NOT_MEMORIZED"
const val FINANCEMENT_CREDIT = 1
const val FINANCEMENT_LOA = 2
const val FINANCEMENT_LOCASSURANCE = 3

val GALLERY_REQUEST_CODE = 1234
val MY_FILES_REQUEST_CODE = 100
val CAMERA_REQUEST_CODE = 13
const val WORKFLOW = "WORKFLOW"
const val CONTACT_DATA = "CONTACT"
const val LOCAL_BRAODCAST_INTERNET_ACTION = "NO_INTERNET"

object ApiResponseCodes {
    const val API_SUCCESS_200 = 200
    const val API_CREATED = 201
    const val API_NO_CONTENT = 204
    const val API_UNAUTHORIZED = 401
    const val API_BAD_REQUEST = 400
    const val SERVICE_UNVAILABLE = 503
    const val INTERNAL_SERVER_ERROR = 500
}

const val FILE = "file"
const val CONTENT = "content"
const val IMAGE_JPEG = "image/jpeg"
const val IMAGE_PNG = "image/png"
const val IMAGE_JPG = "image/jpg"

const val DATE_FORMAT_DMY = "dd/MM/yyyy"
const val DATE_FORMAT_YEAR_MONTH_DAY_DASH = "yyyy-MM-dd"
const val YEAR_PERIODICITE = 1
const val TRIMESTRE_PERIODICITE = 4
const val SEMESTRE_PERIODICITE = 2
const val MONTHS_PERIODICITE = 12

const val APPLICATION_PDF = "application/pdf"
const val MAX_NUM_CO_EMPRUNTEURS = 5

const val TYPE_PDF = "pdf"
const val TYPE_IMAGE = "png"
const val SOURCE = "selfcare"

const val DOSSIER_DATA = "DOSSIER_DATA"
const val PROFILE_DATA = "PROFILE_DATA"


const val CUREENT_STEP_SIZE = R.dimen._35sdp
const val STEP_SIZE = R.dimen._20sdp
const val LAST_STEP=6
const val SECOND_STEP=1

const val NO_ERROR="NO_ERROR"

const val STEP_TRANSFERT_AGENCE = 0
const val STEP_PRISE_EN_CHARGE = 1
const val STEP_VERFICATION_PIECES = 2
const val STEP_ETUDE_DOSSIER = 3
const val STEP_EDITION_OFFRE = 4
const val STEP_RECEPTION_OFFRE = 5
const val STEP_PAIEMENT = 6
val PROFILE_ID_CO_EMPRUNTEUR = 31
val PROFILE_ID_EMPRUNTEUR = 30

val DOCUMENT_TYPE_CODE_QUESTIONNAIRE = "QUEST"
