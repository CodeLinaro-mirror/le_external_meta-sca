SUMMARY = "YAML 1.2 processor"
HOMEPAGE = "https://metacpan.org/pod/YAML::PP"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "Artistic-1.0 AND GPL-2.0-only"
LIC_FILES_CHKSUM = "file://LICENSE;md5=1af3dd18939834f88fae5b9a0dfd5ccc"

SRC_URI = "https://cpan.metacpan.org/authors/id/T/TI/TINITA/YAML-PP-v${PV}.tar.gz"

SRC_URI[sha256sum] = "3ddfb2bdd2e7ef2d949dbd8ffb51439164c84d22bff615e47dbd8ea48ba75cae"

UNPACKDIR ??= "${WORKDIR}/sources"
S = "${UNPACKDIR}/YAML-PP-v${PV}"

inherit cpan
inherit cpan-fixups
inherit_defer nativesdk

UPSTREAM_CHECK_REGEX = "YAML-PP-v(?P<pver>\d+.\d+(.\d+)*).tar.gz"
