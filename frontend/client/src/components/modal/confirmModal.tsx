import { ConfirmModalInterface } from '../../interface/common/modalInterface';
import ConfirmContents from './confirmContent';
import Modal from './modal';
import { useModal } from './modalClass';

function ConfirmModal({ content }: ConfirmModalInterface) {
  const { modalOpen, closeModal } = useModal();
  const confirmModal = 'confirm';

  return (
    <div>
      <Modal
        closeModal={() => {
          closeModal(confirmModal);
        }}
        OpenModal={modalOpen[confirmModal]}
        width="w-[20%] bg-color-white"
        height="h-200px">
        <ConfirmContents
          content={content as string}
          okAction={() => {
            closeModal(confirmModal);
            window.location.href = '/notice';
          }}
        />
      </Modal>
    </div>
  );
}

export default ConfirmModal;
